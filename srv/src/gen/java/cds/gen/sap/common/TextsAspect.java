package cds.gen.sap.common;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("sap.common.TextsAspect")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface TextsAspect extends CdsData {
  String LOCALE = "locale";

  /**
   * Type for a language code
   */
  String getLocale();

  /**
   * Type for a language code
   */
  void setLocale(String locale);

  static TextsAspect create() {
    return Struct.create(TextsAspect.class);
  }

  static TextsAspect of(Map<String, Object> map) {
    return Struct.access(map).as(TextsAspect.class);
  }
}
