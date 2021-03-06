package com.suse.salt.netapi.calls.modules;

import com.suse.salt.netapi.calls.LocalCall;

import com.google.gson.reflect.TypeToken;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * salt.modules.state
 */
public class State {

    private State() { }

    public static LocalCall<Map<String, Object>> apply(List<String> mods) {
        LinkedHashMap<String, Object> args = new LinkedHashMap<>();
        args.put("mods", mods);
        return new LocalCall<>("state.apply", Optional.empty(), Optional.of(args),
                new TypeToken<Map<String, Object>>() { });
    }

    public static LocalCall<Map<String, Object>> apply(String... mods) {
        return apply(Arrays.asList(mods));
    }

}
