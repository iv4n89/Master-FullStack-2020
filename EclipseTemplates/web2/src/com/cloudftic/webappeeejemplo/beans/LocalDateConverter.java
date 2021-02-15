/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudftic.webappeeejemplo.beans;

import java.time.LocalDate;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("conversor.LocalDate")
public class LocalDateConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value==null || value.isEmpty()? null : LocalDate.parse(value);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return o==null? "" : ((LocalDate) o).toString();
    }
}
