/*
 * Copyright 2000-2013 Vaadin Ltd.
 *
 *
 * Modifications Copyright 2017 appreciated
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.uitest;

import com.github.appreciated.material.MaterialTheme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ThemeResource;
import com.vaadin.server.UserError;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import com.vaadin.v7.ui.ComboBox;

public class ComboBoxes extends VerticalLayout implements View {
    public ComboBoxes() {
        setSpacing(false);

        Label h1 = new Label("Combo Boxes");
        h1.addStyleName(ValoTheme.LABEL_H1);
        addComponent(h1);

        HorizontalLayout row = new HorizontalLayout();
        row.addStyleName(ValoTheme.LAYOUT_HORIZONTAL_WRAPPING);
        addComponent(row);

        ComboBox combo = new ComboBox("Normal");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setNullSelectionAllowed(false);
        combo.select(combo.getItemIds().iterator().next());
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.setItemIcon(combo.getItemIds().iterator().next(),
                new ThemeResource("../runo/icons/16/document.png"));
        row.addComponent(combo);

        row.addComponent(getComboBoxWithStyle(ValoTheme.LAYOUT_COMPONENT_GROUP));
        row.addComponent(getComboBoxWithStyle(MaterialTheme.LAYOUT_COMPONENT_GROUP_BORDERLESS));
        row.addComponent(getComboBoxWithStyle(MaterialTheme.LAYOUT_COMPONENT_GROUP_MATERIAL));

        combo = new ComboBox("Explicit size");
        combo.setInputPrompt("You can type here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.setWidth("260px");
        combo.setHeight("60px");
        row.addComponent(combo);

        combo = new ComboBox("No text input allowed");
        combo.setInputPrompt("You can click here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.setTextInputAllowed(false);
        combo.setNullSelectionAllowed(false);
        combo.select("Option One");
        row.addComponent(combo);

        combo = new ComboBox("Error");
        combo.setInputPrompt("You can type here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.setNullSelectionAllowed(false);
        combo.select("Option One");
        combo.setComponentError(new UserError("Fix it, now!"));
        row.addComponent(combo);

        combo = new ComboBox("Error, borderless");
        combo.setInputPrompt("You can type here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.setNullSelectionAllowed(false);
        combo.select("Option One");
        combo.setComponentError(new UserError("Fix it, now!"));
        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
        row.addComponent(combo);

        combo = new ComboBox("Disabled");
        combo.setInputPrompt("You can't type here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.setEnabled(false);
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName("color1");
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName("color2");
        row.addComponent(combo);

        combo = new ComboBox("Custom color");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName("color3");
        row.addComponent(combo);

        combo = new ComboBox("Small");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(ValoTheme.COMBOBOX_SMALL);
        row.addComponent(combo);

        combo = new ComboBox("Large");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(ValoTheme.COMBOBOX_LARGE);
        row.addComponent(combo);

        combo = new ComboBox("Borderless");
        combo.setInputPrompt("You can type here");
        combo.addItem("Option One");
        combo.addItem("Option Two");
        combo.addItem("Option Three");
        combo.addStyleName(ValoTheme.COMBOBOX_BORDERLESS);
        row.addComponent(combo);

        combo = new ComboBox("Tiny");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(ValoTheme.COMBOBOX_TINY);
        row.addComponent(combo);

        combo = new ComboBox("Huge");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(ValoTheme.COMBOBOX_HUGE);
        row.addComponent(combo);

        combo = new ComboBox("Floating");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(MaterialTheme.COMBOBOX_FLOATING);
        row.addComponent(combo);

        combo = new ComboBox("Custom");
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.addStyleName(MaterialTheme.COMBOBOX_CUSTOM);
        row.addComponent(combo);
    }

    private Component getComboBoxWithStyle(String style) {
        CssLayout group = new CssLayout();
        group.setCaption(style);
        group.addStyleName(style);

        ComboBox combo = new ComboBox();
        combo.setInputPrompt("You can type here");
        combo.setContainerDataSource(ValoThemeUI.generateContainer(200, false));
        combo.setNullSelectionAllowed(false);
        combo.select(combo.getItemIds().iterator().next());
        combo.setItemCaptionPropertyId(ValoThemeUI.CAPTION_PROPERTY);
        combo.setItemIconPropertyId(ValoThemeUI.ICON_PROPERTY);
        combo.setWidth("240px");
        group.addComponent(combo);
        Button today = new Button("Do It");
        group.addComponent(today);
        return group;
    }

    @Override
    public void enter(ViewChangeEvent event) {
    }
}
