package com.mygame.game.aspects;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspects {
    @Pointcut("execution(* com.mygame.game.controller..*.*(..))")
    public void RequestParamLogPointCut() {
        //empty method declares a point cut
    }

    @Before("RequestParamLogPointCut()")
    public void doPointCut(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        log.info("LogAspects logging request param:{}", JSON.toJSONString(args));
    }
}