package ru.unn.agile.currencyconverter.view;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import ru.unn.agile.currencyconverter.viewmodel.ViewModel;

public class CurrencyConverter {
    @FXML
    private ViewModel viewModel;

    @FXML
    private TextField addSrcCode;
    @FXML
    private TextField addTgtCode;
    @FXML
    private TextField addRate;

    @FXML
    private TextField convSrcCode;
    @FXML
    private TextField convTgtCode;
    @FXML
    private TextField convAmount;

    @FXML
    void initialize() {
        addSrcCode.textProperty().bindBidirectional(viewModel.addSrcCodeProperty());
        addTgtCode.textProperty().bindBidirectional(viewModel.addTgtCodeProperty());
        addRate.textProperty().bindBidirectional(viewModel.addRateProperty());

        convSrcCode.textProperty().bindBidirectional(viewModel.convSrcCodeProperty());
        convTgtCode.textProperty().bindBidirectional(viewModel.convTgtCodeProperty());
        convAmount.textProperty().bindBidirectional(viewModel.convAmountProperty());
    }

    @FXML
    public void handleAddButtonAction(ActionEvent event) {
        viewModel.addCurrencyPair();
    }

    @FXML
    public void handleConvertButtonAction(ActionEvent event) {
        viewModel.convertCurrency();
    }
}
