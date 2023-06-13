import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
import nube.model.ItemManagement;

class OrderSlipPanel extends ContentPanel {
	private DefaultTableModel tableModel;
	private JPanel orderSlipPanel, tablePanel;
	private JTable table;
	private JScrollPane tableSP;
	private JTextField amount;
	private JLabel orderSlipLabel, note;
	
	private JLabel itemCodeLabel, quantityLabel, sizeLabel;
	private JTextField itemCodeLabelTF;
	private JButton confirm, add, remove;
	private JComboBox sizeCB, quantityCB;
	
	private ArrayList<Integer> numberList = new ArrayList<>();
	
	OrderSlipPanel(int color) {
		super(color);
		
		orderSlipPanel = new JPanel();
		orderSlipPanel.setBackground(new Color(0xFFBD59));
        orderSlipPanel.setBounds(685, 0, 500, 585);
        orderSlipPanel.setLayout(null);
        
        orderSlipLabel = new JLabel("ORDER SLIP FORM");
        orderSlipLabel.setHorizontalAlignment(JLabel.CENTER);
        orderSlipLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        orderSlipLabel.setForeground(new Color(0x293476));
        orderSlipLabel.setBounds(20, 20, 460, 30);
        
        String text = "Before you add items please check the size chart and items offered";
		
        note = new JLabel("<html><div style='text-align: center;'>" + text + "</div></html>");
        note.setHorizontalAlignment(JLabel.CENTER);
		note.setFont(new Font("Tahoma", Font.BOLD, 11));
		note.setBounds(20, 60, 460, 15);
		
		itemCodeLabel = new JLabel("ENTER ITEM CODE:");
		itemCodeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		itemCodeLabel.setForeground(Color.BLACK);
		itemCodeLabel.setBounds(30, 90, 200, 20);
		
		itemCodeLabelTF = new JTextField();
		itemCodeLabelTF.setFont(new Font("Tahoma", Font.BOLD, 16));
		itemCodeLabelTF.setForeground(Color.BLACK);
		itemCodeLabelTF.setBounds(210, 90, 262, 25);
		
		quantityLabel = new JLabel("QUANTITY:");
		quantityLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		quantityLabel.setForeground(Color.BLACK);
		quantityLabel.setBounds(30, 130, 120, 20);
		
		String qty[] = {"1", "2", "3", "4", "5"};
		
		quantityCB = new JComboBox(qty);
		quantityCB.setForeground(Color.BLACK);
		quantityCB.setBackground(Color.WHITE);
		((JLabel) quantityCB.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		quantityCB.setBounds(140, 130, 100, 25);
		
		sizeLabel = new JLabel("ITEM SIZE:");
		sizeLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		sizeLabel.setForeground(Color.BLACK);
		sizeLabel.setBounds(260, 130, 120, 20);
		
		String sizes[] = {"XS", "S", "M", "L", "XL", "2XL", "3XL", "4XL", "5XL", "6XL", "MTO"};
		
		sizeCB = new JComboBox(sizes);
		sizeCB.setForeground(Color.BLACK);
		sizeCB.setBackground(Color.WHITE);
		((JLabel) sizeCB.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		sizeCB.setBounds(370, 130, 100, 25);
		
		add = new JButton("ADD");
		add.setHorizontalAlignment(SwingConstants.CENTER);
		add.setFont(new Font("Tahoma", Font.BOLD, 15));
		add.setBackground(new Color(0x33FF33));
		add.setForeground(Color.WHITE);
		add.setBounds(220, 170, 115, 25);
		add.setFocusable(false);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	addItem();
            }
        });
        
        remove = new JButton("REMOVE");
        remove.setHorizontalAlignment(SwingConstants.CENTER);
        remove.setFont(new Font("Tahoma", Font.BOLD, 15));
        remove.setBackground(new Color(0XFF3333));
        remove.setForeground(Color.WHITE);
        remove.setBounds(355, 170, 115, 25);
        remove.setFocusable(false);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String select = JOptionPane.showInputDialog(null, "ENTER THE ID:", "Delete Item", JOptionPane.INFORMATION_MESSAGE);
                if (select != null && !select.isEmpty()) {
                    int id = Integer.parseInt(select);

                    int rowCount = tableModel.getRowCount();
                    boolean found = false;
                    for (int i = 0; i < rowCount; i++) {
                        int rowId = (int) tableModel.getValueAt(i, 0);
                        if (rowId == id) {
                            tableModel.removeRow(i);
                            numberList.remove(i);
                            updateRowNumbers();
                            found = true;
                            break; // Exit the loop after removing the row
                        }
                    }

                    if (found) {
                        updateTotal();
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid ID", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No ID entered", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
 
        tablePanel = new JPanel();
        tablePanel.setBounds(25, 210, 450, 300);
        tablePanel.setLayout(new BorderLayout());

        String[] columnNames = {"ID","ITEM CODE", "ITEM", "DESCRIPTION", "SIZE", "QUANTITY", "UNIT PRICE", "AMOUNT"};
        
        tableModel = new DefaultTableModel();
        for (String columnName : columnNames) {
            tableModel.addColumn(columnName);
        }
        
        table = new JTable(tableModel);
        table.setRowHeight(40);
        table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setBackground(new Color(0x293478));
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setResizingAllowed(false);
        table.setOpaque(true);
        table.setEnabled(false);
        
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  // Disable auto-resizing of columns
        TableColumnModel columnModel = table.getColumnModel();
        
        columnModel.getColumn(0).setPreferredWidth(25);  // Set width of # column
        columnModel.getColumn(1).setPreferredWidth(150); // Set width of ITEM CODE column
        columnModel.getColumn(2).setPreferredWidth(150); // Set width of ITEM column
        columnModel.getColumn(3).setPreferredWidth(350); // Set width of DESCRIPTION column
        columnModel.getColumn(4).setPreferredWidth(100);  // Set width of SIZE column
        columnModel.getColumn(5).setPreferredWidth(100);  // Set width of QUANTITY column
        columnModel.getColumn(6).setPreferredWidth(100); // Set width of UNIT PRICE column
        columnModel.getColumn(7).setPreferredWidth(100); // Set width of AMOUNT column
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.setDefaultRenderer(Object.class, centerRenderer);
        
        tableSP = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        amount = new JTextField(10);
        amount.setFont(new Font("Tahoma", Font.BOLD, 15));
        amount.setForeground(Color.WHITE);
        amount.setBackground(new Color(0x293478));
        amount.setHorizontalAlignment(SwingConstants.RIGHT);
        amount.setEditable(false);
        
        tablePanel.add(tableSP, BorderLayout.CENTER);
        tablePanel.add(amount, BorderLayout.SOUTH);
        
        confirm = new JButton("CONFIRM");
		confirm.setHorizontalAlignment(SwingConstants.CENTER);
		confirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		confirm.setBackground(new Color(0x293478));
		confirm.setForeground(Color.WHITE);
		confirm.setBounds(200, 530, 115, 25);
		confirm.setFocusable(false);
		confirm.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        if (tableModel.getRowCount() == 0) {
		            JOptionPane.showMessageDialog(null, "No item selected.", "Order Confirmation", JOptionPane.WARNING_MESSAGE);
		        } else {
		            int confirmation = JOptionPane.showConfirmDialog(null, "Do you want to confirm your orders?", "Order Confirmation", JOptionPane.YES_NO_OPTION);
		            if (confirmation == JOptionPane.YES_OPTION) {
		                String _totalAmount = getTotalAmount();
		                OrderSlipSummary summary = new OrderSlipSummary(_totalAmount);
		                int[] selectedColumns = {1, 4, 5, 6, 7};
		                summary.addColumnsToDestinationTable(getColumnData(tableModel, selectedColumns));

		                tableModel.setRowCount(0);
		                numberList.clear();

		                updateTotal();
		            }
		        }
		    }
		});
        
        orderSlipPanel.add(tablePanel);
        orderSlipPanel.add(itemCodeLabel);
        orderSlipPanel.add(quantityLabel);
        orderSlipPanel.add(sizeLabel);
        orderSlipPanel.add(itemCodeLabelTF);
        orderSlipPanel.add(quantityCB);
        orderSlipPanel.add(sizeCB);
        orderSlipPanel.add(add);
        orderSlipPanel.add(remove);
        orderSlipPanel.add(confirm);
        orderSlipPanel.add(orderSlipLabel);
        orderSlipPanel.add(note);

		addPanel(orderSlipPanel);
		
	}
	
	private void addItem() {
	    ItemManagement itemManagement = new ItemManagement("", "", "", "", 0);

	    String itemCode = itemCodeLabelTF.getText();
	    String validateItemCode = itemManagement.getItemCode(itemCode);
	    String item = itemManagement.getItem(itemCode);
	    String description = itemManagement.getDescription(itemCode);
	    String size = (String) sizeCB.getSelectedItem();
	    String quantity = (String) quantityCB.getSelectedItem();
	    double unitPrice = itemManagement.getPrice(itemCode, size);

	    if (!itemCode.isEmpty() && !quantity.isEmpty() && !size.isEmpty()) {
	    	
	    	if (!itemCode.equals(validateItemCode)) {
	    		JOptionPane.showMessageDialog(null, "Invalid item code!", "Error", JOptionPane.ERROR_MESSAGE);
	    		
	    	} else {
	    		JOptionPane.showMessageDialog(null, "Successfully added item!", "Add item", JOptionPane.INFORMATION_MESSAGE);
	    		
	    		int qty = Integer.parseInt(quantity);
		        double price = unitPrice;
		        double amount = qty * price;
		        
		        int rowNumber = numberList.size() + 1;
	            numberList.add(rowNumber);

				tableModel.addRow(new Object[]{rowNumber, itemCode, item, description, size, quantity, price, amount});

		        clearFields();

		        updateTotal();
	    	}
	        
	    } else {
    		JOptionPane.showMessageDialog(null, "You need to insert ITEM CODE!", "Error", JOptionPane.ERROR_MESSAGE);
	    }
    }
	
	
	private void updateTotal() { //method to add the total price amount
        double total = 0.0;
        int rowCount = tableModel.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String priceString = tableModel.getValueAt(i, 7).toString();
            double price = Double.parseDouble(priceString);
            total += price;
        }

        amount.setText("Total Amount: " + total);
    }
	
	private void updateRowNumbers() {
	    int rowCount = tableModel.getRowCount();
	    for (int i = 0; i < rowCount; i++) {
	        tableModel.setValueAt(i + 1, i, 0);
	        numberList.set(i, i + 1);
	    }
	}
	
	private void clearFields() {
		 itemCodeLabelTF.setText("");
         quantityCB.setSelectedItem(Integer.valueOf(0));
 	     sizeCB.setSelectedItem(Integer.valueOf(0));
	}
	
	private Vector<Vector<Object>> getColumnData(DefaultTableModel model, int[] columnIndices) {
        Vector<Vector<Object>> columnData = new Vector<>();

        for (int i = 0; i < model.getRowCount(); i++) {
            Vector<Object> rowData = new Vector<>();
            for (int columnIndex : columnIndices) {
                rowData.add(model.getValueAt(i, columnIndex));
            }
            columnData.add(rowData);
        }

        return columnData;
    }
	
	private String getTotalAmount() {
		String totalAmount = amount.getText();
		
		String total_amount = totalAmount;
		
		return total_amount;
	}
}
