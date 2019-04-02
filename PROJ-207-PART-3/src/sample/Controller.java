package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

//import java.awt.event.ActionEvent;
import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Connection conn;

    @FXML
    private ComboBox cbCustomerId;

    @FXML
    private TextField CustFirstName;

    @FXML
    private TextField CustLastName;

    @FXML
    private TextField CustAddress;

    @FXML
    private TextField CustCity;

    @FXML
    private TextField CustProv;

    @FXML
    private TextField CustPostal;

    @FXML
    private TextField CustCountry;

    @FXML
    private TextField CustHomePhone;

    @FXML
    private TextField CustBusPhone;

    @FXML
    private TextField CustEmail;

    @FXML
    private ComboBox cbAgentId;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnClearCustomer;

    @FXML
    private Button btnAddCustomer;

    @FXML
    private ComboBox cbBookingId;

    @FXML
    private DatePicker BookingDate;

    @FXML
    private TextField BookingNo;

    @FXML
    private ComboBox cbTripTypeId;

    @FXML
    private TextField TravelerCount;

    @FXML
    private ComboBox cbCustId;

    @FXML
    private Button btnEditBookings;

    @FXML
    private Button btnSaveBookings;

    @FXML
    private Button btnClearBookings;

    @FXML
    private Button btnAddBookings;

    @FXML
    private TextField PackageId;

    @FXML
    private ComboBox cbPackageId;

    @FXML
    private TextField PkgName;

    @FXML
    private DatePicker PkgStartDate;

    @FXML
    private DatePicker PkgEndDate;

    @FXML
    private TextField PkgDesc;

    @FXML
    private TextField PkgBasePrice;

    @FXML
    private TextField PkgAgencyCommission;

    @FXML
    private Button btnEditPackages;

    @FXML
    private Button btnSavePackages;

    @FXML
    private Button btnClearPackages;

    @FXML
    private Button btnAddPackages;

    @FXML
    private ComboBox cbProductId;

    @FXML
    private TextField ProdName;

    @FXML
    private Button btnAddProducts;

    @FXML
    private Button btnEditProducts;

    @FXML
    private Button btnSaveProducts;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    void initialize() {
        assert cbCustomerId != null : "fx:id=\"cbCustomerId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustFirstName != null : "fx:id=\"CustFirstName\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustLastName != null : "fx:id=\"CustLastName\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustAddress != null : "fx:id=\"CustAddress\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustCity != null : "fx:id=\"CustCity\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustProv != null : "fx:id=\"CustProv\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustPostal != null : "fx:id=\"CustPostal\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustCountry != null : "fx:id=\"CustCountry\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustHomePhone != null : "fx:id=\"CustHomePhone\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustBusPhone != null : "fx:id=\"CustBusPhone\" was not injected: check your FXML file 'realSample.fxml'.";
        assert CustEmail != null : "fx:id=\"CustEmail\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbAgentId != null : "fx:id=\"cbAgentId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnEdit != null : "fx:id=\"btnEdit\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnSave != null : "fx:id=\"btnSave\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnClearCustomer != null : "fx:id=\"btnClearCustomer\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnAddCustomer != null : "fx:id=\"btnAddCustomer\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbBookingId != null : "fx:id=\"cbBookingId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert BookingDate != null : "fx:id=\"BookingDate\" was not injected: check your FXML file 'realSample.fxml'.";
        assert BookingNo != null : "fx:id=\"BookingNo\" was not injected: check your FXML file 'realSample.fxml'.";
        assert TravelerCount != null : "fx:id=\"TravelerCount\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbCustId != null : "fx:id=\"cbCustId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbTripTypeId != null : "fx:id=\"cbTripTypeId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PackageId != null : "fx:id=\"PackageId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnEditBookings != null : "fx:id=\"btnEditBookings\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnSaveBookings != null : "fx:id=\"btnSaveBookings\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnClearBookings != null : "fx:id=\"btnClearBookings\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnAddBookings != null : "fx:id=\"btnAddBookings\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbPackageId != null : "fx:id=\"cbPackageId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgName != null : "fx:id=\"PkgName\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgStartDate != null : "fx:id=\"PkgStartDate\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgEndDate != null : "fx:id=\"PkgEndDate\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgDesc != null : "fx:id=\"PkgDesc\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgBasePrice != null : "fx:id=\"PkgBasePrice\" was not injected: check your FXML file 'realSample.fxml'.";
        assert PkgAgencyCommission != null : "fx:id=\"PkgAgencyCommission\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnEditPackages != null : "fx:id=\"btnEditPackages\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnSavePackages != null : "fx:id=\"btnSavePackages\" was not injected: check your FXML file 'realSample.fxml'.";
        assert cbProductId != null : "fx:id=\"cbProductId\" was not injected: check your FXML file 'realSample.fxml'.";
        assert ProdName != null : "fx:id=\"ProdName\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnEditProducts != null : "fx:id=\"btnEditProducts\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnSaveProducts != null : "fx:id=\"btnSaveProducts\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnAddProducts != null : "fx:id=\"btnAddProducts\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnClearPackages != null : "fx:id=\"btnClearPackages\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnAddPackages != null : "fx:id=\"btnAddPackages\" was not injected: check your FXML file 'realSample.fxml'.";
        assert btnDeleteProduct != null : "fx:id=\"btnDeleteProduct\" was not injected: check your FXML file 'realSample.fxml'.";

    }

    boolean addSave = false;

    private void myAlert(String title, String content, String addInfo)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Saved Data");
        alert.setContentText("Successfully updated the data for: " + ProdName.getText() + PkgName.getText() + BookingNoGen() + CustFirstName.getText());
        alert.setHeaderText(null);
        alert.showAndWait();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Start");
        try {
            conn = new DB().getConnection();
            buildCombo();
            buildComboBooking();
            buildComboPackages();
            buildComboProducts();
            buildComboTripTypes();
            buildComboAgent();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void addCustomer(ActionEvent event) {
        addSave = true;
        cbCustomerId.setValue(null);
        ClearCustTF();

        DisableCustTF(cbCustomerId);
        cbAgentId.setDisable(false);

        btnAddCustomer.setDisable(true);
        btnEdit.setDisable(true);
        btnSave.setDisable(false);

    }

    private void ClearCustTF() {
        CustFirstName.setText(" ");
        CustLastName.setText(" ");
        CustAddress.setText(" ");
        CustCity.setText(" ");
        CustProv.setText(" ");
        CustPostal.setText(" ");
        CustCountry.setText(" ");
        CustHomePhone.setText(" ");
        CustBusPhone.setText(" ");
        CustEmail.setText(" ");
    }

    private void DisableCustTF(ComboBox cbCustomerId) {
        CustFirstName.setDisable(false);
        CustLastName.setDisable(false);
        CustAddress.setDisable(false);
        CustCity.setDisable(false);
        CustProv.setDisable(false);
        CustPostal.setDisable(false);
        CustCountry.setDisable(false);
        CustHomePhone.setDisable(false);
        CustBusPhone.setDisable(false);
        CustEmail.setDisable(false);
        cbCustomerId.setDisable(true);
    }

    @FXML
    void editCustomer(ActionEvent event) {
        if (cbCustomerId.getValue() != null) {
            addSave = false;
            CustFirstName.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustFirstName());
            CustLastName.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustLastName());
            CustAddress.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustAddress());
            CustCity.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustCity());
            CustProv.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustProv());
            CustPostal.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustPostal());
            CustCountry.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustCountry());
            CustHomePhone.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustHomePhone());
            CustBusPhone.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustBusPhone());
            CustEmail.setText(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustEmail());
            cbAgentId.setValue(String.valueOf(((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getAgentId()));

            DisableCustTF(cbAgentId);
            cbAgentId.setDisable(false);
            cbCustomerId.setDisable(true);
            btnSave.setDisable(false);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Customer ID", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    void saveCustomer(ActionEvent event) {
        if (addSave) {
            try {
                insertCustomer(CustFirstName.getText(), CustLastName.getText(), CustAddress.getText(), CustCity.getText(), CustProv.getText(), CustPostal.getText(), CustCountry.getText(), CustHomePhone.getText(), CustBusPhone.getText(), CustEmail.getText(), String.valueOf(cbAgentId.getValue()));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("New Customer Added");
            myAlert("Saved Customer", "You have successfully added the Customer: ", CustFirstName.getText());
        } else if (!addSave) {
            try {
                updateCustomer();
                JOptionPane.showMessageDialog(null, "Customer Data is Saved, Please select the Customer ID again to view data", "Saving Data", JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Save");
            ClearCustTF();
            cbAgentId.setValue(null);
        }
    }

    private void updateCustomer() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update customers set CustFirstName=?, CustLastName=?, CustAddress=?, CustCity=?, CustProv=?, CustPostal=?, CustCountry=?, CustHomePhone=?, CustBusPhone=?, CustEmail=?, AgentId=? where CustomerId=?");
        stmt.setString(1, (CustFirstName.getText()));
        stmt.setString(2, (CustLastName.getText()));
        stmt.setString(3, (CustAddress.getText()));
        stmt.setString(4, (CustCity.getText()));
        stmt.setString(5, (CustProv.getText()));
        stmt.setString(6, (CustPostal.getText()));
        stmt.setString(7, (CustCountry.getText()));
        stmt.setString(8, (CustHomePhone.getText()));
        stmt.setString(9, (CustBusPhone.getText()));
        stmt.setString(10, (CustEmail.getText()));
        stmt.setString(11, String.valueOf((cbAgentId.getValue())));
        stmt.setInt(12, ((Customer) cbCustomerId.getSelectionModel().getSelectedItem()).getCustId());
        stmt.executeUpdate();
        buildCombo();
    }

    private void insertCustomer(String CustFirstName, String CustLastName, String CustAddress, String CustCity, String CustProv, String CustPostal, String CustCountry, String CustHomePhone, String CustBusPhone, String CustEmail, String AgentId) throws  SQLException {
        System.out.println("Insert Customer");
        PreparedStatement ubstmt = conn.prepareStatement("INSERT INTO Customers (CustFirstName, CustLastName, CustAddress, CustCity, CustProv, CustPostal, CustCountry, CustHomePhone, CustBusPhone, CustEmail, AgentId)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        ubstmt.setString(1, CustFirstName);
        ubstmt.setString(2, CustLastName);
        ubstmt.setString(3, CustAddress);
        ubstmt.setString(4, CustCity);
        ubstmt.setString(5, CustProv);
        ubstmt.setString(6, CustPostal);
        ubstmt.setString(7, CustCountry);
        ubstmt.setString(8, CustHomePhone);
        ubstmt.setString(9, CustBusPhone);
        ubstmt.setString(10, CustEmail);
        ubstmt.setString(11, AgentId);
        ubstmt.executeUpdate();
        System.out.println("Customer worked");
    }

    private void buildComboAgent() throws SQLException {
        ObservableList<Agent> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Agents");
        while (rs.next()) {
            data.add(new Agent(rs.getInt(1)));
        }
        cbAgentId.setItems(data);
    }

    private void buildCombo() throws SQLException {
        ObservableList<Customer> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Customers");
        while (rs.next()) {
            data.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getInt(12)));
        }
        cbCustomerId.setItems(data);
        cbCustId.setItems(data);
        cbCustomerId.valueProperty().addListener(new ChangeListener<Customer>() {
            @Override
            public void changed(ObservableValue observable, Customer oldValue, Customer newValue) {
                if (newValue != null) {
                    CustFirstName.setText(newValue.getCustFirstName());
                    CustLastName.setText(newValue.getCustLastName());
                    CustAddress.setText(newValue.getCustAddress());
                    CustCity.setText(newValue.getCustCity());
                    CustProv.setText(newValue.getCustProv());
                    CustPostal.setText(newValue.getCustPostal());
                    CustCountry.setText(newValue.getCustCountry());
                    CustHomePhone.setText(newValue.getCustHomePhone());
                    CustBusPhone.setText(newValue.getCustBusPhone());
                    CustEmail.setText(newValue.getCustEmail());
                    cbAgentId.setValue(String.valueOf(newValue.getAgentId()));
                }
            }
        });
        CustDisableTrue();
        cbCustomerId.setDisable(false);
        btnSave.setDisable(true);
    }


    @FXML
    void clearCustomer(ActionEvent event) {
        cbCustomerId.setDisable(false);
        cbCustomerId.setValue(null);
        cbAgentId.setValue(null);
        ClearCustTF();
        CustDisableTrue();
        btnEdit.setDisable(false);
        btnAddCustomer.setDisable(false);
        btnSave.setDisable(true);
    }

    private void CustDisableTrue() {
        CustFirstName.setDisable(true);
        CustLastName.setDisable(true);
        CustAddress.setDisable(true);
        CustCity.setDisable(true);
        CustProv.setDisable(true);
        CustPostal.setDisable(true);
        CustCountry.setDisable(true);
        CustHomePhone.setDisable(true);
        CustBusPhone.setDisable(true);
        CustEmail.setDisable(true);
        cbAgentId.setDisable(true);
    }

    @FXML
    void addBookings(ActionEvent event) {
        addSave = true;
        cbBookingId.setValue(null);
        BookingNo.setDisable(true);
        BookingDate.setValue(null);
        BookingDate.setDisable(false);
        TravelerCount.setText(" ");
        TravelerCount.setDisable(false);
        cbCustId.setDisable(false);
        cbTripTypeId.setValue(" ");
        cbTripTypeId.setDisable(false);
        btnSaveBookings.setDisable(false);
        btnEditBookings.setDisable(true);
        btnAddBookings.setDisable(true);

        BookingNo.setText("Will be auto generated...?");
    }

    @FXML
    void editBookings(ActionEvent event) {
        if (cbBookingId.getValue() != null) {
            addSave = false;
            BookingNo.setText(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getBookingNo());

            String yolo = String.valueOf(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getBookingDate());
            BookingDate.setValue(LOCAL_DATE(yolo));
            TravelerCount.setText(String.valueOf(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getTravelerCount()));
            cbCustId.setValue(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getCustomerId());
            cbTripTypeId.setValue(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getTripTypeId());

            if (((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getPackageId() == 0) {
                PackageId.setText(null);
            } else {
                PackageId.setText(String.valueOf(((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getPackageId()));
            }
            BookingNo.setDisable(true);
            BookingDate.setDisable(false);
            TravelerCount.setDisable(false);
            cbCustId.setDisable(true);
            cbTripTypeId.setDisable(false);
            PackageId.setDisable(false);
            cbBookingId.setDisable(true);
            btnSaveBookings.setDisable(false);
            btnAddBookings.setDisable(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Booking ID", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    void saveBookings(ActionEvent event) {
        if (addSave){
            try {
            insertBookings(BookingNoGen(), BookingDate.getValue(), TravelerCount.getText(), String.valueOf(cbTripTypeId.getValue()), String.valueOf(cbCustId.getValue()));
        } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("New Booking Added");
            myAlert("Saved Booking", "You have successfully added the Booking: ", BookingNo.getText());
        }
        else if (!addSave) {
            try {
                updateBookings();
                JOptionPane.showMessageDialog(null, "Booking Data is Saved, Please select the Booking ID again to view data", "Saving Data", JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Save");
            BookingNo.setText(" ");
            BookingDate.setValue(null);
            TravelerCount.setText(" ");
            cbCustId.setValue(" ");
            cbTripTypeId.setValue(" ");
            PackageId.setText(" ");
        }
    }

    private void updateBookings() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update bookings set BookingNo=?, BookingDate=?, TravelerCount=?, CustomerId=?, TripTypeId=?, PackageId=? where BookingId=?");
        stmt.setString(1, (BookingNo.getText()));
        stmt.setString(2, String.valueOf((BookingDate.getValue())));
        stmt.setString(3, (TravelerCount.getText()));
        stmt.setString(4, String.valueOf((cbCustId.getValue())));
        stmt.setString(5, String.valueOf((cbTripTypeId.getValue())));
        stmt.setString(6, (PackageId.getText()));
        stmt.setInt(7, ((Bookings) cbBookingId.getSelectionModel().getSelectedItem()).getBookingId());
        stmt.executeUpdate();
        buildComboBooking();
    }

    private String BookingNoGen() {
        String BookingNo = "";
        Random random = new Random();
        int min = 0;
        int max = 50;
        int number1 = random.nextInt(max - min + 1) + min;
        int number2 = random.nextInt(max - min + 1) + min;

        // _ _ _ _
        // First: Trip type
        // Second: Alphabet
        // Third + Fourth: Random Number

        // Grab trip type

        BookingNo = cbTripTypeId.getSelectionModel().getSelectedItem() + "Z" + number1 + number2;

        return BookingNo;
    }

    private void insertBookings(String BookingNo, LocalDate BookingDate, String TravelerCount, String TripTypeId, String CustomerId) throws SQLException
    {
        System.out.println("Insert bookings");
        PreparedStatement ubstmt = conn.prepareStatement("INSERT INTO Bookings (BookingNo, BookingDate, TripTypeId, TravelerCount, CustomerId)" + "VALUES (?, ?, ?, ?, ?)");
        // System.out.println("Insert");

        ubstmt.setString(1, BookingNo);

        //ubstmt.setString(1, BookingNoGen());
        ubstmt.setString(2, String.valueOf(BookingDate));
        ubstmt.setString(3, TripTypeId);
        ubstmt.setString(4, String.valueOf(TravelerCount));
        ubstmt.setString(5, CustomerId);
        ubstmt.executeUpdate();
        System.out.println("bookings Worked");
    }

    // ubstmt.setString(4, String.valueOf(CustId));

    // ubstmt.setString(5, String.valueOf(PackageId));
    //AgtLastName.setVisible(false);  this is for hiding the content

    private void buildComboTripTypes() throws SQLException {
        ObservableList<TripTypes> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from TripTypes");
        while (rs.next()) {
            data.add(new TripTypes(rs.getString(1), rs.getString(2)));
        }
        cbTripTypeId.setItems(data);
    }
    private void buildComboBooking() throws SQLException {
        ObservableList<Bookings> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Bookings");
        while (rs.next()) {
            data.add(new Bookings(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
        }
        cbBookingId.setItems(data);
        cbBookingId.valueProperty().addListener(new ChangeListener<Bookings>() {
            @Override
            public void changed(ObservableValue observable, Bookings oldValue, Bookings newValue) {
                if (newValue != null) {
                    BookingNo.setText(newValue.getBookingNo());

                    // TOO DIFFICULT :(
                    // FIX IT BEFORE 03-19-2019 :( ?

                    String yolo = String.valueOf(newValue.getBookingDate());

                    BookingDate.setValue(LOCAL_DATE(yolo));
                    TravelerCount.setText(String.valueOf(newValue.getTravelerCount()));
                    cbCustId.setValue(newValue.getCustomerId());
                    cbTripTypeId.setValue(newValue.getTripTypeId());
                    PackageId.setText(String.valueOf(newValue.getPackageId()));
                }
            }
        });
        BookingNo.setDisable(true);
        BookingDate.setDisable(true);
        TravelerCount.setDisable(true);
        cbCustId.setDisable(true);
        cbTripTypeId.setDisable(true);
        PackageId.setDisable(true);
        cbBookingId.setDisable(false);
        btnSaveBookings.setDisable(true);
    }

    @FXML
    void clearBookings(ActionEvent event) {
        cbBookingId.setDisable(false);
        cbBookingId.setValue(null);
        BookingNo.setDisable(true);
        BookingNo.setText(" ");
        BookingDate.setDisable(true);
        BookingDate.setValue(null);
        TravelerCount.setDisable(true);
        TravelerCount.setText(" ");
        cbCustId.setDisable(true);
        cbCustId.setValue(null);
        cbTripTypeId.setDisable(true);
        cbTripTypeId.setValue(null);
        PackageId.setDisable(true);
        PackageId.setText(null);
        btnEditBookings.setDisable(false);
        btnAddBookings.setDisable(false);
        btnSaveBookings.setDisable(true);
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static final LocalDate LOCAL_DATE(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateString, formatter);
        return localDate;
    }

    @FXML
    void addPackages(ActionEvent event) {
        addSave = true;
        DisabletextFields();
        cbPackageId.setValue(null);
        cleartextFields();
        btnAddPackages.setDisable(true);
        btnEditPackages.setDisable(true);
        btnSavePackages.setDisable(false);


       /* if (cbPackageId.getValue() != null) {
            try {
                insertPackages(PkgName.getText(), PkgStartDate.getValue(), PkgEndDate.getValue(), PkgDesc.getText(), PkgBasePrice.getText(), PkgAgencyCommission.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select Package ID", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("New Package Added");
        myAlert("Saved Package", "You have successfully added the Package: ", PkgName.getText());*/
    }

    private void cleartextFields() {
        PkgName.setText(" ");
        PkgStartDate.setValue(null);
        PkgEndDate.setValue(null);
        PkgDesc.setText(" ");
        PkgBasePrice.setText(" ");
        PkgAgencyCommission.setText(" ");
    }

    @FXML
    void editPackages(ActionEvent event) {
        if (cbPackageId.getValue() != null) {
            addSave = false;
            PkgName.setText(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgName());

            String yolo1 = String.valueOf(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgStartDate());
            String yolo2 = String.valueOf(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgEndDate());

            PkgStartDate.setValue(LOCAL_DATE(yolo1));
            PkgEndDate.setValue(LOCAL_DATE(yolo2));
            PkgDesc.setText(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgDesc());
            PkgBasePrice.setText(String.valueOf(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgBasePrice()));
            PkgAgencyCommission.setText(String.valueOf(((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPkgAgencyCommission()));

            DisabletextFields();
            btnSavePackages.setDisable(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select Package ID", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void DisabletextFields() {
        PkgName.setDisable(false);
        PkgStartDate.setDisable(false);
        PkgEndDate.setDisable(false);
        PkgDesc.setDisable(false);
        PkgBasePrice.setDisable(false);
        PkgAgencyCommission.setDisable(false);
        cbPackageId.setDisable(true);
    }

    @FXML
    void savePackages(ActionEvent event) {
        if (addSave) {
            try {
                insertPackages(PkgName.getText(), PkgStartDate.getValue(), PkgEndDate.getValue(), PkgDesc.getText(), PkgBasePrice.getText(), PkgAgencyCommission.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("New Package Added");
            myAlert("Saved Package", "You have successfully added the Package: ", PkgName.getText());
        }
        else if (!addSave) {
            try {
                updatePackages();
                JOptionPane.showMessageDialog(null, "Package Data is Saved, Please select the Package ID again to view data", "Saving Data", JOptionPane.PLAIN_MESSAGE);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Save");
            cleartextFields();
        }
    }

    private void insertPackages(String Pkgname, LocalDate PkgstartDate, LocalDate PkgendDate, String Pkgdesc, String PkgbasePrice, String PkgagencyCommission) throws SQLException
    {
        System.out.println("Start Insert");
        PreparedStatement ustmt = conn.prepareStatement("INSERT INTO Packages (PkgName, PkgStartDate, PkgEndDate, PkgDesc, PkgBasePrice, PkgAgencyCommission)" + "VALUES (?, ?, ?, ?, ?, ?)");

        ustmt.setString(1, Pkgname);
        ustmt.setString(2, String.valueOf(PkgstartDate));
        ustmt.setString(3, String.valueOf(PkgendDate));
        ustmt.setString(4, Pkgdesc);
        ustmt.setString(5, String.valueOf(PkgbasePrice));
        ustmt.setString(6, String.valueOf(PkgagencyCommission));
        ustmt.executeUpdate();
        System.out.println("Worked");
    }

    private void updatePackages() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update packages set PkgName=?, PkgStartDate=?, PkgEndDate=?, PkgDesc=?, PkgBasePrice=?, PkgAgencyCommission=? where PackageId=?");
        stmt.setString(1, (PkgName.getText()));
        stmt.setString(2, String.valueOf((PkgStartDate.getValue())));
        stmt.setString(3, String.valueOf((PkgEndDate.getValue())));
        stmt.setString(4, (PkgDesc.getText()));
        stmt.setString(5, (PkgBasePrice.getText()));
        stmt.setString(6, (PkgAgencyCommission.getText()));
        stmt.setInt(7, ((Packages) cbPackageId.getSelectionModel().getSelectedItem()).getPackageId());
        stmt.executeUpdate();
        buildComboPackages();
    }

    private void buildComboPackages() throws SQLException {
        ObservableList<Packages> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Packages");
        while (rs.next()) {
            data.add(new Packages(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getString(5), rs.getDouble(6), rs.getDouble(7)));
        }
        cbPackageId.setItems(data);
        cbPackageId.valueProperty().addListener(new ChangeListener<Packages>() {
            @Override
            public void changed(ObservableValue observable, Packages oldValue, Packages newValue) {
                if (newValue != null) {
                    PkgName.setText(newValue.getPkgName());

                    String yolo1 = String.valueOf(newValue.getPkgStartDate());
                    String yolo2 = String.valueOf(newValue.getPkgEndDate());

                    PkgStartDate.setValue(LOCAL_DATE(yolo1));
                    PkgEndDate.setValue(LOCAL_DATE(yolo2));
                    PkgDesc.setText(newValue.getPkgDesc());
                    PkgBasePrice.setText(String.valueOf(newValue.getPkgBasePrice()));
                    PkgAgencyCommission.setText(String.valueOf(newValue.getPkgAgencyCommission()));
                }
            }
        });
        PkgName.setDisable(true);
        PkgStartDate.setDisable(true);
        PkgEndDate.setDisable(true);
        PkgDesc.setDisable(true);
        PkgBasePrice.setDisable(true);
        PkgAgencyCommission.setDisable(true);
        cbPackageId.setDisable(false);
        btnSavePackages.setDisable(true);
    }

    @FXML
    void clearPackages(ActionEvent event) {
        cbPackageId.setDisable(false);
        cbPackageId.setValue(null);
        PkgName.setText(" ");
        PkgName.setDisable(true);
        PkgStartDate.setDisable(true);
        PkgStartDate.setValue(null);
        PkgEndDate.setDisable(true);
        PkgEndDate.setValue(null);
        PkgDesc.setText(" ");
        PkgDesc.setDisable(true);
        PkgBasePrice.setText(" ");
        PkgBasePrice.setDisable(true);
        PkgAgencyCommission.setText(" ");
        PkgAgencyCommission.setDisable(true);
        btnEditPackages.setDisable(false);
        btnAddPackages.setDisable(false);
        btnSavePackages.setDisable(true);
    }

    @FXML
    void addProducts(ActionEvent event) {

        addSave = true;
        ProdName.setDisable(false);
        btnAddProducts.setDisable(true);
        btnEditProducts.setDisable(true);
        btnSaveProducts.setDisable(false);
        ProdName.setText(" ");
        cbProductId.setDisable(true);
        cbProductId.setValue(null);


//        try {
//            insertProducts(ProdName.getText());
//            System.out.println("New Product Added");
//            myAlert("Saved Product", "You have successfully added the ", ProdName.getText());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @FXML
    void editProducts(ActionEvent event) {
        if (cbProductId.getValue() != null) {
            addSave = false;
            ProdName.setText(((Products) cbProductId.getSelectionModel().getSelectedItem()).getProdName());

            ProdName.setDisable(false);
            cbProductId.setDisable(true);
            btnAddProducts.setDisable(true);
            btnSaveProducts.setDisable(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please Select Product ID", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    void saveProducts(ActionEvent event) {

        if (addSave) {
            try {
                insertProducts(ProdName.getText());
                System.out.println("New Product Added");
                myAlert("Saved Product", "You have successfully added the ", ProdName.getText());

               // StartPage();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if (!addSave) {
            try {
                updateProducts();
                JOptionPane.showMessageDialog(null, "Product Data is Saved, Please select the Product ID again to view data", "Saving Data", JOptionPane.PLAIN_MESSAGE);

               // StartPage();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Save");
            ProdName.setText(" ");
            btnAddProducts.setDisable(false);
        }
    }

    @FXML
    void deleteProduct(ActionEvent event) throws SQLException {
       /* try {
            deleteProduct();
            System.out.println("Product Deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
       Statement dstmt = null;

         dstmt = conn.createStatement();
        System.out.println("Delete test: ");

        //dstmt.setString(1, String.valueOf(cbProductId));
        //dstmt.setString(2, String.valueOf(ProdName));
        dstmt.executeUpdate("DELETE FROM Products WHERE ProductId>=1");  //NOT WORKING FOREIGN KEY RESTRAIN
    }

    private void StartPage() {
        ProdName.setDisable(true);
        btnAddProducts.setDisable(false);
        btnEditProducts.setDisable(false);
        btnSaveProducts.setDisable(true);

    }

    private void updateProducts() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("update products set ProdName=? where ProductId=?");
        stmt.setString(1, (ProdName.getText()));
        stmt.setInt(2, ((Products) cbProductId.getSelectionModel().getSelectedItem()).getProductId());
        stmt.executeUpdate();
        buildComboProducts();
    }

    private void insertProducts(String ProdName) throws SQLException
    {
        System.out.println("Insert Product");
        PreparedStatement ustmt = conn.prepareStatement("INSERT INTO Products (ProdName)" + "VALUES (?)");
           // System.out.println("Insert");

            ustmt.setString(1, ProdName);
            ustmt.executeUpdate();
            System.out.println("Product Worked");
    }

    private void deleteProduct() throws SQLException {
/*
        PreparedStatement dstmt = conn.prepareStatement("DELETE FROM Products WHERE ProductId=?");
            System.out.println("Delete test: ");

            dstmt.setString(1, String.valueOf(cbProductId));
            //dstmt.setString(2, String.valueOf(ProdName));
            dstmt.executeUpdate();

            System.out.println();*/
    }

    private void buildComboProducts() throws SQLException {
        ObservableList<Products> data = FXCollections.observableArrayList();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from Products");
        while (rs.next()) {
            data.add(new Products(rs.getInt(1), rs.getString(2)));
        }
        cbProductId.setItems(data);
        cbProductId.valueProperty().addListener(new ChangeListener<Products>() {
            @Override
            public void changed(ObservableValue observable, Products oldValue, Products newValue) {
                if (newValue != null) {
                    ProdName.setText(newValue.getProdName());
                }
            }
        });
        ProdName.setDisable(true);
        cbProductId.setDisable(false);
        btnSaveProducts.setDisable(true);
    }

    @FXML
    void clearProducts(ActionEvent event) {
        ProdName.setDisable(true);
        ProdName.setText(" ");
        btnSaveProducts.setDisable(true);
        btnEditProducts.setDisable(false);
        btnAddProducts.setDisable(false);
        cbProductId.setDisable(false);
    }
}
