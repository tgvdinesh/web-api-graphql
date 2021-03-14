package com.example.graphql.controller;

import com.example.graphql.model.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import io.netty.util.internal.StringUtil;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShowsDataFetcher {

    private final List<Show> shows = List.of(
            new Show("Stranger Things", 2016),
            new Show("Ozark", 2017)
    );

    @DgsData(parentType = "Query", field = "shows")
    public List<Show> shows(@InputArgument("titleFilter") String titleFilter) {
        if (StringUtil.isNullOrEmpty(titleFilter)) return shows;
        return shows.stream()
                .filter(show -> show.getTitle().contains(titleFilter))
                .collect(Collectors.toList());
    }
}
