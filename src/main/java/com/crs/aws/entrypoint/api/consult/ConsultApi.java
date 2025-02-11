package com.crs.aws.entrypoint.api.consult;

import com.crs.aws.entrypoint.dto.in.KeyDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1/consult")
@Tag(name= "consult")
public interface ConsultApi {

    @GetMapping
    @Operation(summary = "Consult with prefix prefix", description =
            "consult with prefix prefix, if send a empty prefix return all keys")
    public ResponseEntity<List<String>> consult(@RequestParam(required = false) String prefix);

}
