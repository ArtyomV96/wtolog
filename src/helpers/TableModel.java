/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import winecatalog.object.WineObject;

/**
 *
 * @author wans8
 */
public class TableModel extends AbstractTableModel{

    int rowCount;
    int columnCount;
    List<WineObject> wine;

    public TableModel(int rowCount, int columnCount, List<WineObject> wine) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.wine = wine;
    }
          
    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }
    
    @Override
    public String getColumnName(int column) {
         switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Название";
            case 2:
                return "Цвет";
            case 3:
                return "Сахар";
            case 4:
                return "Страна";
            case 5:
                return "Цена";
            default:
                return "Other Column";
         }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return wine.get(rowIndex).getId();
            case 1:
                return wine.get(rowIndex).getName();
            case 2:
                return wine.get(rowIndex).getColor();
            case 3:
                return wine.get(rowIndex).getSugar();
            case 4:
                return wine.get(rowIndex).getCountry();
            case 5:
                return wine.get(rowIndex).getPrice();
            default:
                return "Other Column";
         }
    }
    
    public WineObject getObj(int rowIndex) {
        
                return wine.get(rowIndex);
    }

}
