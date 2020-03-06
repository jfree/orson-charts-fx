/**
 * Orson Charts FX extends Orson Charts to provide support for JavaFX.
 */
module org.jfree.chart3d.fx {
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.jfree.chart3d;
    requires org.jfree.fxgraphics2d;
    exports com.orsoncharts.fx;
    exports com.orsoncharts.fx.interaction;
}
