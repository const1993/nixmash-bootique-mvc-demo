package com.nixmash.mvc.views;

import io.bootique.mvc.AbstractView;

public class ConcreteView extends AbstractView {

    private Object model;

    public ConcreteView(String template, Object model) {
        super(template);
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}