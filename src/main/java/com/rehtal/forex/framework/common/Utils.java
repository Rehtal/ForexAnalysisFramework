package com.rehtal.forex.framework.common;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Utils {
  public static List<String[]> readCsv(String fileName) throws IOException {
    CSVReader reader = new CSVReader(new FileReader(fileName));
    List<String[]> content = reader.readAll();
    reader.close();

    return content;
  }

  public static void writeCsv(List<String[]> content, String fileName) throws IOException {
    CSVWriter writer = new CSVWriter(new FileWriter(fileName));
    writer.writeAll(content);
    writer.close();
  }
}
