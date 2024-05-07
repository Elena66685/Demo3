package com.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private Label check22;

    @FXML
    private Label check21;

    @FXML
    private Label check23;

    @FXML
    private CheckBox check3;

    @FXML
    private CheckBox check4;

    @FXML
    private RadioButton man;

    @FXML
    private Label man2;

    @FXML
    private TextField name;

    @FXML
    private Label name2;

    @FXML
    private TextField patronymic;

    @FXML
    private Label patronymic2;

    @FXML
    private Label program2;

    @FXML
    private ComboBox<String> programBox;
    ObservableList<String> program = FXCollections.observableArrayList("Бокс", "Танцы", "Йога", "Фитнес");

    @FXML
    private TextField surname;

    @FXML
    private Label surnane2;

    @FXML
    private RadioButton women;

    @FXML
    void initialize()
    {
        programBox.setItems(program);
        programBox.setValue("Бокс");
    }

    @FXML
    protected void onClick()
    {
        String valuo = name.getText();
        String b = patronymic.getText();
        String n = surname.getText();
        ToggleGroup group = new ToggleGroup();
        man.setToggleGroup(group);
        man.setSelected(true);
        women.setToggleGroup(group);
        surnane2.setText("");
        check22.setText("");
        program2.setText("");
        check21.setText("");
        check23.setText("");
        if (!(valuo.equals("") || b.equals("") || n.equals(""))) {
            String valuo2 = valuo + " " + b + " " + n;
            name2.setText(valuo2);
            man2.setText(programBox.getValue());
            RadioButton button = (RadioButton) group.getSelectedToggle();
            patronymic2.setText(button.getText());
            if (!(check1.isSelected() || check2.isSelected() || check3.isSelected() || check4.isSelected()))
            {
                program2.setText("Вы не выбрали доп.услуги!");
            }
            if (check1.isSelected()) program2.setText(check1.getText());
            if (check2.isSelected()) check21.setText(check2.getText());
            if (check3.isSelected()) check22.setText(check3.getText());
            if (check4.isSelected()) check23.setText(check4.getText());
        }
        else
        {
            surnane2.setText("Введите ваше имя, фамилию и отчество!");
        }
    }
}
