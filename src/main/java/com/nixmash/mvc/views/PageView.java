package com.nixmash.mvc.views;

import io.bootique.mvc.AbstractView;

// intentionally keeping the view class in a different package
// from API and IT to test per-package template laoding
public class PageView extends AbstractView {

    private Object model;

    public PageView(String template, Object model) {
        super(template);
        this.model = model;
    }

    public Object getModel() {
        return model;
    }
}