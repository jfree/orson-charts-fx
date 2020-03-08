/**
 * Orson Charts FX extends Orson Charts to provide support for JavaFX.  For the 
 * latest information about these projects, please visit their respective 
 * GitHub pages:
 * <ul>
 * <li><a href="https://github.com/jfree/orson-charts-fx">https://github.com/jfree/orson-charts-fx</a>
 * <li><a href="https://github.com/jfree/orson-charts">https://github.com/jfree/orson-charts</a>
 * </ul>
 */
module org.jfree.chart3d.fx {
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.jfree.chart3d;
    requires org.jfree.fxgraphics2d;
    exports org.jfree.chart3d.fx;
    exports org.jfree.chart3d.fx.interaction;
}
