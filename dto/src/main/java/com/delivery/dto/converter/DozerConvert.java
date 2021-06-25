package com.delivery.dto.converter;


import com.delivery.domain.Client;
import com.delivery.dto.ClientDto;
import org.dozer.DozerBeanMapper;
import org.dozer.DozerConverter;

public class DozerConvert extends DozerConverter {

  DozerBeanMapper mapper = new DozerBeanMapper();

    public DozerConvert(Class Client, Class ClientDto) {
        super(Client, ClientDto);
    }

    @Override
    public Object convertTo(Object Client, Object ClientDto) {
        com.delivery.domain.Client clientEntity = new Client();
        return mapper.map(clientEntity, ClientDto.class);
    }

    @Override
    public Object convertFrom(Object Client, Object ClientDto) {
        ClientDto clientDto = new ClientDto();
        return mapper.map(clientDto, Client.class);
    }
}
