package com.rehtal.forex.framework.split;

import java.util.EnumMap;
import java.util.List;

import com.rehtal.forex.framework.data.ForexData;

/**
 * @author Rehtal
 * @since 2017-03-07
 */
public interface DataSpliter {
  public static enum DataTypeEnum {
    TRAIN, TEST,;
  }

  EnumMap<DataTypeEnum, List<ForexData>> split(List<ForexData> allData);
}
