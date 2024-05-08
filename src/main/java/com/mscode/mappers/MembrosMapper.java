package com.mscode.mappers;

import com.mscode.dto.MembrosDTO;
import com.mscode.entity.Membros;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MembrosMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static MembrosDTO toDto(Membros membros) {
        return modelMapper.map(membros, MembrosDTO.class);
    }

    public static Membros toEntity(MembrosDTO membrosDTO) {
        return modelMapper.map(membrosDTO, Membros.class);
    }
}
