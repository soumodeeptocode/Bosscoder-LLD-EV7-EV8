package com.bosscoder.oop.design.pattern.factory.abstractfactory;

import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons.Button;
import com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown.Dropdown;

public class Client {
    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        UiFactory uiFactory = flutter.createUiFactory();
        Button button = uiFactory.createButton();
        Dropdown dropdown = uiFactory.createDropdown();

        button.paint();
        dropdown.paint();
    }
}
