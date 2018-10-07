package com.isa.patterns.proxy.caching;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {

    private final Map<String, List<String>> users = ImmutableMap.of("us", Lists.newArrayList("user1", "user2"),
                                                                    "en", Lists.newArrayList("user3", "user4", "user5"));
    private int count;

    @Override
    public List<String> getUsers(String country) {
        count++;
        return users.get(country);
    }

    @Override
    public int getAccessCount() {
        return count;
    }
}
