package cds.gen;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;
import java.time.Instant;
import javax.annotation.processing.Generated;

/**
 * Aspect for entities with temporal data
 *
 * See https://cap.cloud.sap/docs/cds/common#aspect-temporal
 */
@CdsName("temporal")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-24T10:31:50.709062657Z",
    comments = "com.sap.cds:cds-maven-plugin:3.6.0 / com.sap.cds:cds4j-api:3.6.1"
)
public interface Temporal_ extends StructuredType<Temporal_> {
  String CDS_NAME = "temporal";

  ElementRef<Instant> validFrom();

  ElementRef<Instant> validTo();
}
