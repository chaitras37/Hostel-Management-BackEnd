package practise_security.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import practise_security.dao.StudentRepository;
import practise_security.dao.UserRepository;
import practise_security.model.Student;
import practise_security.model.User;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
@Autowired
UserRepository userRepository;
@Autowired
StudentRepository studentRepository;
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
					
		return UserDetailsImpl.build(user);
		
	}

}
