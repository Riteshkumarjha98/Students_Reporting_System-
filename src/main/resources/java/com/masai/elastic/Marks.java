package com.masai.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(indexName = "marks")
public class Marks {
    @Id
    private int id;

 
    @Field(type = FieldType.Text, name = "student")
    private Student student;

    @Field(type = FieldType.Text, name = "semester")
    private int semester;

    @Field(type = FieldType.Text, name = "subject")
    private String subject;


    
    
}
