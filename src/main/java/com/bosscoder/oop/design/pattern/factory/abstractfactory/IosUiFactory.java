package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.Button;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.IosButton;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.Dropdown;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.IOSDropDown;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropDown();
    }

    @Override
    public SupportedPlatform handlePlatformType() {
        return SupportedPlatform.IOS;
    }
}
