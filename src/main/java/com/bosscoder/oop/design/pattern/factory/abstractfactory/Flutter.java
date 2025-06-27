package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import java.util.List;

public class Flutter {
    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }


    public UiFactory createUiFactory() {
        UiPlatformFactory uiPlatformFactory = new UiPlatformFactory(List.of(
                new AndroidUiFactory(), new IosUiFactory()
        ));
        return UiPlatformFactory.getUiFactory(this.platform);
    }
}
