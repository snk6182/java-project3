package com.example.controller;
import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController public class DashboardController {
 @GetMapping("/api/tasks") public Map<String,Object> data(){return Map.of("total",24,"completed",15,"inProgress",6,"pending",3,"tasks",List.of(
 Map.of("name","Design login page","owner","Arun","status","Completed","priority","High"),
 Map.of("name","Create REST API","owner","Priya","status","In Progress","priority","High"),
 Map.of("name","Write deployment script","owner","Rahul","status","Pending","priority","Medium"),
 Map.of("name","Application testing","owner","Meena","status","In Progress","priority","Medium")));}}
