package com.gentooboy.javabom.boardapi.model.articles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Article {

  String type;
  String id;
  Attributes attributes;
  Links links;
}
