package com.mscode.config;

//@Service
public class SecurityDatabaseService {


// implements UserDetailsLoader {

//    @Autowired
//    private UserRepository userRepository;
//
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public SecurityDatabaseService(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) {
//        User userEntity = userRepository.findByUsername(username);
//        if (userEntity == null) {
//            throw new UsernameNotFoundException(username);
//        }
//        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
//        userEntity.getRoles().forEach(role -> {
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
//        });
//        UserDetails user = new org.springframework.security.core.userdetails.User(userEntity.getUsername(),
//                passwordEncoder.encode(userEntity.getPassword()),
//                authorities);
//        return user;
//    }
}
