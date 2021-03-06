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
 

package com.gwtext.client.widgets.form.event;

import com.gwtext.client.widgets.form.HtmlEditor;

/**
 *
 * @author Sanjiv Jivan
 */
public class HtmlEditorListenerAdapter extends FieldListenerAdapter implements HtmlEditorListener {

    public void onActivate(HtmlEditor field) {
    }

    public boolean doBeforePush(HtmlEditor field, String html) {
        return true;
    }

    public boolean doBeforeSync(HtmlEditor field, String html) {
        return true;
    }

    public void onEditModeChange(HtmlEditor field, boolean sourceEdit) {
    }

    public void onInitialize(HtmlEditor field) {
    }

    public void onPush(HtmlEditor field, String html) {
    }

    public void onSync(HtmlEditor field, String html) {
    }
}
