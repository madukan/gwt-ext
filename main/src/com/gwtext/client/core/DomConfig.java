/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 
package com.gwtext.client.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.gwtext.client.util.JavaScriptObjectHelper;

import java.util.*;

/**
 * The Dom object spec. Can be configured with specs of children too. If no tag is specified then a div will
 * be automatically generated with the specified attributes.
 *
 * @author Sanjiv Jivan
 * @see DomHelper#append(String, DomConfig)
 * @see ExtElement#createChild(DomConfig)
 */
public class DomConfig {

    private String tag;
    private String id;
    private String cls;
    private String style;
    private String html;
    private List children;

    private Map otherConfig = new HashMap();

    /**
     * Create a new DomConfig using a "div" tag.
     */
    public DomConfig() {
        this.tag = "div";
    }

    /**
     * Create a new DomConfig.
     *
     * @param tag the tag name
     */
    public DomConfig(String tag) {
        this.tag = tag;
    }

    /**
     * Constructor.
     *
     * @param tag the element tag name
     * @param id  the element id
     */
    public DomConfig(String tag, String id) {
        this.tag = tag;
        this.id = id;
    }

    /**
     * Constructor.
     *
     * @param tag the element tag name
     * @param id  the element id
     * @param cls the element CSS class name
     */
    public DomConfig(String tag, String id, String cls) {
        this.tag = tag;
        this.id = id;
        this.cls = cls;
    }

    /**
     * Constructor.
     *
     * @param tag  the element tag name
     * @param id   the element id
     * @param cls  the element CSS class name
     * @param html the innerHTML for the element.
     */
    public DomConfig(String tag, String id, String cls, String html) {
        this.tag = tag;
        this.id = id;
        this.cls = cls;
        this.html = html;
    }

    /**
     * Set the CSS style.
     *
     * @param style the CSS style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Add a child element.
     *
     * @param child the child element config
     * @return this
     */
    public DomConfig addChild(DomConfig child) {
        if (html != null) {
            throw new IllegalArgumentException("Dom spec cannot have inner html and child elelents");
        }
        if (children == null) children = new ArrayList();
        children.add(child);
        return this;
    }

    public void addAttribute(String name, String value) {
        otherConfig.put(name, value);
    }

    public JavaScriptObject getJsObject() {
        JavaScriptObject jsObj = JavaScriptObjectHelper.createObject();
        if (tag != null) JavaScriptObjectHelper.setAttribute(jsObj, "tag", tag);
        if (id != null) JavaScriptObjectHelper.setAttribute(jsObj, "id", id);
        if (cls != null) JavaScriptObjectHelper.setAttribute(jsObj, "cls", cls);
        if (style != null) JavaScriptObjectHelper.setAttribute(jsObj, "style", style);
        if (html != null) JavaScriptObjectHelper.setAttribute(jsObj, "html", html);

        for (Iterator iterator = otherConfig.keySet().iterator(); iterator.hasNext();) {
            String attribute = (String) iterator.next();
            String value=(String) otherConfig.get(attribute);
            JavaScriptObjectHelper.setAttribute(jsObj, attribute, value);
        }
        
        if (children != null) {
            JavaScriptObject[] childrenJS = new JavaScriptObject[children.size()];
            int i = 0;
            for (Iterator it = children.iterator(); it.hasNext(); i++) {
                DomConfig config = (DomConfig) it.next();
                childrenJS[i] = config.getJsObject();
            }
            JavaScriptObjectHelper.setAttribute(jsObj, "children", childrenJS);
        }
        return jsObj;
    }
}
