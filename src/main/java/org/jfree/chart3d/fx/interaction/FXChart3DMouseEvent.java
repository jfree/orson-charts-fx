/* ====================================================
 * Orson Charts FX : JavaFX extensions for Orson Charts
 * ====================================================
 * 
 * Copyright 2013-2022, by David Gilbert.  All rights reserved.
 * 
 * https://github.com/jfree/orson-charts-fx
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * [Oracle and Java are registered trademarks of Oracle and/or its affiliates. 
 * Other names may be trademarks of their respective owners.]
 * 
 * If you do not wish to be bound by the terms of the GPL, an alternative
 * license is available to sponsors (higher tiers only) of the JFree projects.
 * For details, please see visit:
 *
 * https://github.com/sponsors/jfree
 * 
 */

package org.jfree.chart3d.fx.interaction;

import javafx.event.Event;
import javafx.event.EventType;
import javafx.scene.input.MouseEvent;
import org.jfree.chart3d.fx.Chart3DViewer;
import org.jfree.chart3d.graphics3d.RenderedElement;

/**
 * A chart mouse event for the {@link Chart3DViewer} component.
 * 
 * @since 1.4
 */
public class FXChart3DMouseEvent extends Event {

    /** Mouse clicked event type. */
    public static final EventType<FXChart3DMouseEvent> MOUSE_CLICKED 
            = new EventType<>("FXChart3DMouseEvent.CLICKED");
    
    /** Mouse moved event type. */
    public static final EventType<FXChart3DMouseEvent> MOUSE_MOVED 
            = new EventType<>("FXChart3DMouseEvent.MOVED");

    /** The chart element under the mouse pointer. */
    private final RenderedElement element;
    
    /** The JavaFX mouse event that triggered this event. */
    private final MouseEvent trigger;
    
    /**
     * Creates a new event.
     * 
     * @param source  the event source.
     * @param eventType  the event type.
     * @param element  the chart element under the mouse pointer.
     * @param trigger  the mouse event that triggered this event.
     */
    public FXChart3DMouseEvent(Object source, 
            EventType<? extends Event> eventType,
            RenderedElement element, MouseEvent trigger) {
        super(eventType);
        this.element = element;
        this.trigger = trigger;
    }
    
    /**
     * Returns the chart element under the mouse pointer.
     * 
     * @return The chart element. 
     */
    public RenderedElement getElement() {
        return this.element;
    }
    
    /**
     * Returns the mouse event that triggered this event.
     * 
     * @return The mouse event. 
     */
    public MouseEvent getTrigger() {
        return this.trigger;
    }
}
