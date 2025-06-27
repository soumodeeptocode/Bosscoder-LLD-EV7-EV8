package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UiPlatformFactory {

    private static final Map<SupportedPlatform, UiFactory> uiFactoryMapByPlatform= new HashMap<SupportedPlatform, UiFactory>();

    //
    public UiPlatformFactory(List<UiFactory> uiFactoryList) {
        for (UiFactory uiFactory : uiFactoryList) {
            uiFactoryMapByPlatform.put(uiFactory.handlePlatformType(), uiFactory);
        }
    }

    public static UiFactory getUiFactory(SupportedPlatform supportedPlatform) {
        UiFactory uiFactory = uiFactoryMapByPlatform.get(supportedPlatform);
        if(null == uiFactory) {
            throw new IllegalArgumentException("Unsupported platform: " + supportedPlatform);
        }
        return uiFactory;
    }
//    public static UiFactory getUiFactoryForPlatform(SupportedPlatform platform) {
//        return switch (platform) {
//            case IOS -> new IosUiFactory();
//            case ANDROID -> new AndroidUiFactory();
//        };
//    }
}
