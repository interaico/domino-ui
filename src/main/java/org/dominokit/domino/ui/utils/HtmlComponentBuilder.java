package org.dominokit.domino.ui.utils;

import elemental2.dom.HTMLElement;
import elemental2.dom.Node;
import org.gwtproject.safehtml.shared.SafeHtml;
import org.jboss.gwt.elemento.core.HasElements;
import org.jboss.gwt.elemento.core.IsElement;
import org.jboss.gwt.elemento.core.builder.HtmlContentBuilder;

public class HtmlComponentBuilder<E extends HTMLElement, T extends IsElement<E>> extends HtmlContentBuilder<E>{

    private T component;

    public HtmlComponentBuilder(T component) {
        super(component.asElement());
        this.component = component;
    }

    public T build(){
        return component;
    }

    @Override
    public HtmlComponentBuilder<E, T> innerHtml(SafeHtml html) {
        super.innerHtml(html);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> add(IsElement element) {
        super.add(element);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> add(String text) {
        super.add(text);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> add(Node element) {
        super.add(element);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> addAll(HasElements elements) {
        super.addAll(elements);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> addAll(HTMLElement... elements) {
        super.addAll(elements);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> addAll(Iterable<? extends Node> elements) {
        super.addAll(elements);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> addAll(IsElement... elements) {
        super.addAll(elements);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> textContent(String text) {
        super.textContent(text);
        return this;
    }

    @Override
    public HtmlComponentBuilder<E, T> css(String... classes) {
        super.css(classes);
        return this;
    }
}
