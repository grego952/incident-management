package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.common.Countries.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface CountriesTexts extends CdsData {
  String LOCALE = "locale";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  /**
   * Type for a language code
   */
  String getLocale();

  /**
   * Type for a language code
   */
  void setLocale(String locale);

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  CountriesTexts_ ref();

  static CountriesTexts create() {
    return Struct.create(CountriesTexts.class);
  }

  static CountriesTexts of(Map<String, Object> map) {
    return Struct.access(map).as(CountriesTexts.class);
  }
}
