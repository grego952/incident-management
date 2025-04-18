package cds.gen.sap.capire.incidents;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("sap.capire.incidents.Status.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface StatusTexts_ extends StructuredType<StatusTexts_> {
  String CDS_NAME = "sap.capire.incidents.Status.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
