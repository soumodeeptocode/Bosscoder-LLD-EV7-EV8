package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.Button;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.Dropdown;

public interface UiFactory {
    Button createButton();
    Dropdown createDropdown();
    SupportedPlatform handlePlatformType();
}
