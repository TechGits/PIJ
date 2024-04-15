import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {
    public static void main(String[] args) throws IOException {
        // Create a new workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet in the workbook
        Sheet sheet = workbook.createSheet("Person Data");

        // Create a header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Age");

        // Create data rows
        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("John");
        dataRow.createCell(1).setCellValue(30);

        // Write the workbook to an Excel file
        try (FileOutputStream fileOut = new FileOutputStream("person_data.xlsx")) {
            workbook.write(fileOut);
        }

        // Close the workbook
        workbook.close();
    }
}
