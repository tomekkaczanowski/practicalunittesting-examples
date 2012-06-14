package com.practicalunittesting.com;

import com.practicalunittesting.DiscountCalculator;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import static org.testng.Assert.assertEquals;

/**
 * Practical Unit Testing with TestNG and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Test
public class ReadExcelTest {

    @DataProvider
    public Iterator<Object[]> discountData() throws IOException, BiffException {
        ArrayList<Object[]> myEntries = new ArrayList<Object[]>();
        File inputWorkbook = new File("src/test/resources/financial.xls");
        String value, discount;
        Workbook w = Workbook.getWorkbook(inputWorkbook);
        Sheet sheet = w.getSheet(0);
        for (int row = 1; row < sheet.getRows(); row++) {
            value= sheet.getCell(0, row).getContents();
            discount = sheet.getCell(1, row).getContents();
            myEntries.add(new Object [] {value,discount});
        }
        return myEntries.iterator();
    }

    @Test(dataProvider = "discountData")
    public void shouldCalculateDiscount(String value,String discount) {
        assertEquals(DiscountCalculator.calculateDiscount(Double.parseDouble(value)),
                Double.parseDouble(discount));
    }
}
