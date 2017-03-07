package com.rehtal.forex.framework.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import com.rehtal.forex.framework.data.ForexData;

public interface Model {
  boolean train(List<ForexData> trainData);

  Object evaluate(List<ForexData> testData);

  Object predict();

  boolean loadFromStream(InputStream inputStream);

  boolean dumpToStream(OutputStream outputStream);
}
