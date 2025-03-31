package org.example.t250331_gpt.mapper;

import org.example.t250331_gpt.domain.Lunch;

import java.util.List;

public interface LunchMapper {
    List<Lunch> selectAll();
}