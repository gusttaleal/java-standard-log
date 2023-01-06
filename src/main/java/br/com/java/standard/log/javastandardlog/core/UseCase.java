package br.com.java.standard.log.javastandardlog.core;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class UseCase {
    public static void useCaselogInfo() {
        log.info("Log Info Message");
    }

    public static void useCaselogWarn() {
        log.warn("Log Warn Message");
    }

    public static void useCaselogError() {
        log.error("Log Error Message");
    }
}
