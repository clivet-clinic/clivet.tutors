package br.com.clivet.tutors.mapper;

import br.com.clivet.tutors.domain.TutorsDomain;
import br.com.clivet.tutors.model.request.TutorRequestPATCHDto;
import br.com.clivet.tutors.model.request.TutorRequestPOSTDto;
import br.com.clivet.tutors.model.response.TutorResponse;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface TutorsMapper {

    TutorsDomain toEntity(TutorRequestPOSTDto dto);

    // PATCH: Atualiza entidade com dados do PATCH DTO
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntityFromPatchDto(TutorRequestPATCHDto dto, @MappingTarget TutorsDomain entity);

    // Entidade → Response
    TutorResponse toResponse(TutorsDomain entity);
}
