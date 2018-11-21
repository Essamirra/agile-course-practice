package ru.unn.agile.triangle.viewmodel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ViewModelTest {
    private final double delta = 0.001;
    private ViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new ViewModel();
    }

    @After
    public void tearDown() {
        viewModel = null;
    }

    @Test
    public void initViewModelWithDefaultValues() {
        assertEquals("", viewModel.aXProperty().get());
        assertEquals("", viewModel.bXProperty().get());
        assertEquals("", viewModel.cXProperty().get());
        assertEquals("", viewModel.aYProperty().get());
        assertEquals("", viewModel.bYProperty().get());
        assertEquals("", viewModel.cYProperty().get());
    }

    @Test
    public void canGetPerimeter() {
        viewModel.aXProperty().set("0.0");
        viewModel.aYProperty().set("0.0");
        viewModel.bXProperty().set("5.0");
        viewModel.bYProperty().set("0.0");
        viewModel.cXProperty().set("5.0");
        viewModel.cYProperty().set("12.0");

        viewModel.perimeter();

        assertEquals("30.0", viewModel.getResult());
    }

    @Test
    public void canGetSquare() {
        viewModel.aXProperty().set("0.0");
        viewModel.aYProperty().set("0.0");
        viewModel.bXProperty().set("8.0");
        viewModel.bYProperty().set("0.0");
        viewModel.cXProperty().set("8.0");
        viewModel.cYProperty().set("15.0");

        viewModel.square();

        assertEquals("60.0", viewModel.getResult());
    }

    @Test
    public void canABLength() {
        viewModel.aXProperty().set("0.0");
        viewModel.aYProperty().set("0.0");
        viewModel.bXProperty().set("3.0");
        viewModel.bYProperty().set("4.0");
        viewModel.cXProperty().set("0.0");
        viewModel.cYProperty().set("1.0");

        viewModel.getLengthAB();

        assertEquals("5.0", viewModel.getResult());
    }

    @Test
    public void canBCLength() {
        viewModel.aXProperty().set("1.0");
        viewModel.aYProperty().set("1.0");
        viewModel.bXProperty().set("3.0");
        viewModel.bYProperty().set("0.0");
        viewModel.cXProperty().set("3.0");
        viewModel.cYProperty().set("5.0");

        viewModel.getLengthBC();

        assertEquals("5.0", viewModel.getResult());
    }

    @Test
    public void canCALength() {
        viewModel.aXProperty().set("0.0");
        viewModel.aYProperty().set("0.0");
        viewModel.bXProperty().set("3.0");
        viewModel.bYProperty().set("0.0");
        viewModel.cXProperty().set("3.0");
        viewModel.cYProperty().set("4.0");

        viewModel.getLengthCA();

        assertEquals("5.0", viewModel.getResult());
    }

    @Test
    public void buttonIsDisabledInitially() {
        assertTrue(viewModel.btnDisabledProperty().get());
    }

    @Test
    public void canCABAngle() {
        viewModel.aXProperty().set("-4.0");
        viewModel.aYProperty().set("-3.0");
        viewModel.bXProperty().set("3.0");
        viewModel.bYProperty().set("4.0");
        viewModel.cXProperty().set("1.0");
        viewModel.cYProperty().set("-1.0");

        viewModel.getCABAngle();

        assertEquals(2.331, Double.parseDouble(viewModel.getResult()), delta);
    }

    @Test
    public void canABCAngle() {
        viewModel.aXProperty().set("1.0");
        viewModel.aYProperty().set("-1.0");
        viewModel.bXProperty().set("-4.0");
        viewModel.bYProperty().set("-3.0");
        viewModel.cXProperty().set("3.0");
        viewModel.cYProperty().set("4.0");

        viewModel.getABCAngle();

        assertEquals(2.331, Double.parseDouble(viewModel.getResult()), delta);
    }

    @Test
    public void canBCAAngle() {
        viewModel.aXProperty().set("3.0");
        viewModel.aYProperty().set("4.0");
        viewModel.bXProperty().set("1.0");
        viewModel.bYProperty().set("-1.0");
        viewModel.cXProperty().set("-4.0");
        viewModel.cYProperty().set("-3.0");

        viewModel.getBCAAngle();

        assertEquals(2.331, Double.parseDouble(viewModel.getResult()), delta);
    }
}
