package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.AndroidButton;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.Button;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.AndroidDropDown;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.Dropdown;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropDown();
    }

    @Override
    public SupportedPlatform handlePlatformType() {
        return SupportedPlatform.ANDROID;
    }
}
