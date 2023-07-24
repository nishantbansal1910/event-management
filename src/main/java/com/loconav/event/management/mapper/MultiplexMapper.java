package com.loconav.event.management.mapper;

import com.loconav.event.management.entity.Multiplex;
import com.loconav.event.management.model.request.CreateMultiplexesRequest;
import com.loconav.event.management.model.response.CreateMultiplexesResponse;
import com.loconav.event.management.model.response.user.MultiplexByEventResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface MultiplexMapper {
    MultiplexMapper INSTANCE= Mappers.getMapper(MultiplexMapper.class);

    Multiplex multiplexRequestToMultiplex(CreateMultiplexesRequest createMultiplexesRequest);
    CreateMultiplexesResponse multiplexToMultiplexResponse(Multiplex multiplex);

    MultiplexByEventResponse multiplexToMultiplexByEventResponse(Multiplex multiplex);

    List<CreateMultiplexesResponse> multiplexListToMultiplexResponseList(final List<Multiplex> multiplex);
}
