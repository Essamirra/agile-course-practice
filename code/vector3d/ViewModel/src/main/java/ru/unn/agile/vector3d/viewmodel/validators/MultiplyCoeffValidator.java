package ru.unn.agile.vector3d.viewmodel.validators;

import ru.unn.agile.vector3d.viewmodel.ViewModel;

public class MultiplyCoeffValidator extends VectorValidator {
    @Override
    public void validate(final ViewModel viewModel) {
        super.validate(viewModel);

        if (!ViewModel.Status.READY.toString()
                .equals(viewModel.statusProperty().get())) {
            return;
        }

        String multCoeff = viewModel.getMultiplicationCoeff();

        if (multCoeff.isEmpty()) {
            viewModel.statusProperty().set(ViewModel.Status.WAITING.toString());
            return;
        }

        try {
            Double.parseDouble(multCoeff);
        } catch (NumberFormatException e) {
            viewModel.statusProperty().set(ViewModel.Status.BAD_FORMAT.toString());
            return;
        }

        viewModel.statusProperty().set(ViewModel.Status.READY.toString());
    }
}
