package com.cdutcm3.winter.ms.base.dao.mysql.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import javax.annotation.Resource;

/**
 * *****************************************************
 *
 * @ClassName AbstractBaseService
 * @Description TODO
 * @Author 7000
 * @Date 2020/1/2 0002 21:56
 * @Version 1.0
 * *****************************************************
 **/
@Slf4j
public abstract class AbstractBaseService implements ApplicationEventPublisherAware {

    @Resource
    protected IdService idService;

//    @Autowired
//    protected TransactionOptDelayer delayer;

    private ApplicationEventPublisher applicationEventPublisher;

//    @Autowired
//    protected  SequenceGenerator sequenceGenerator;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void setIdService(IdService idService) {
        this.idService = idService;
    }

//    public void setDelayer(TransactionOptDelayer delayer) {
//        this.delayer = delayer;
//    }
//
//    public void setSequenceGenerator(SequenceGenerator sequenceGenerator) {
//        this.sequenceGenerator = sequenceGenerator;
//    }

    /**
     * 使用spring事件总线发布事件
     * 使用@TransactionalEventListener注解监听事件来达到"事务提交之后处理事件"的效果
     * 替代原本的四种事件发布方式
     *
     * @param event
     */
    protected void publishEvent(ApplicationEvent event) {
        this.applicationEventPublisher.publishEvent(event);
    }



}
