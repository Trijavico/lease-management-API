package com.tdsproject.apigateway.DTO;

import com.tdsproject.apigateway.entities.Images;
import com.tdsproject.apigateway.entities.Property;
import com.tdsproject.apigateway.entities.StatusEnum;

import java.util.List;

public record PropertyDTO(
        Integer id,
        String address,
        StatusEnum status,
        String description,
        Integer size,
        Integer rooms,
        Integer bathrooms,
        Double price,
        String type,
        Double latitude,
        Double longitude,
        List<Images> images,
        OwnerDTO owner
) {
    public static PropertyDTO get(Property property){
        return new PropertyDTO(
                property.getId(),
                property.getAddress(),
                property.getStatus(),
                property.getDescription(),
                property.getSize(),
                property.getRooms(),
                property.getBathrooms(),
                property.getPrice(),
                property.getType(),
                property.getLatitude(),
                property.getLongitude(),
                property.getImages(),
                OwnerDTO.get(property.getOwner())
        );
    }
}
