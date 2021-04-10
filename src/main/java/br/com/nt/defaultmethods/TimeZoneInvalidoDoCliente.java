package br.com.nt.defaultmethods;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

public interface TimeZoneInvalidoDoCliente extends TimeZoneCliente {

	static final Logger LOGGER = Logger.getLogger(TimeZoneCliente.class);

	@Override
	default ZonedDateTime getZonedDateTime(String zona) {

		try {

			return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zona));
		} catch (DateTimeException e) {
			LOGGER.error("Timezone invalido: " + zona + " utilizanado o timezone default");
			return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
		}
	}

}
