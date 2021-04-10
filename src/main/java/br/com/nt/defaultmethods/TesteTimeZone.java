package br.com.nt.defaultmethods;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.apache.log4j.Logger;

import br.com.nt.datatime.DataTime;

public class TesteTimeZone implements TimeZoneInvalidoDoCliente {

	private static final Logger LOGGER = Logger.getLogger(TimeZoneCliente.class);

	public static void main(String[] args) {

		LOGGER.info(" :: INICIO TESTE TIMEZONE ::");

		TesteTimeZone testeTimeZone = new TesteTimeZone();
		ZonedDateTime dateTime = testeTimeZone.getZonedDateTime("Europa/Desconhecido");
		LOGGER.info(dateTime);
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}

	@Override
	public ZoneId getZoneId(String zona) {
		// TODO Auto-generated method stub
		return ZoneId.of(zona);
	}

}
