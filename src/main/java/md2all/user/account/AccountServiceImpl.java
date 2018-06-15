/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package md2all.user.account;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;


//import sample.hibernate52.domain.HotelSummary;

@Component("accountService")
@Transactional
class AccountServiceImpl implements AccountService {

	private final AccountRepository AccountRepository;
	public AccountServiceImpl(AccountRepository AccountRepository) {
		this.AccountRepository = AccountRepository;
		
	}
/*
	private final HotelRepository hotelRepository;

	public AccountServiceImpl(AccountRepository AccountRepository,
			HotelRepository hotelRepository) {
		this.AccountRepository = AccountRepository;
		this.hotelRepository = hotelRepository;
	}*/

/*	@Override
	public Page<Account> findCities(AccountSearchCriteria criteria, Pageable pageable) {

		Assert.notNull(criteria, "Criteria must not be null");
		String name = criteria.getName();

		if (!StringUtils.hasLength(name)) {
			return this.AccountRepository.findAll(null);
		}

		String country = "";
		int splitPos = name.lastIndexOf(",");

		if (splitPos >= 0) {
			country = name.substring(splitPos + 1);
			name = name.substring(0, splitPos);
		}

		return this.AccountRepository
				.findByNameContainingAndCountryContainingAllIgnoringCase(name.trim(),
						country.trim(), pageable);
	}*/

	@Override
	public Account getAccount(String name) {
		Assert.notNull(name, "Name must not be null");
		return this.AccountRepository.findByName(name);
	}

	/*@Override
	public Page<HotelSummary> getHotels(Account Account, Pageable pageable) {
		Assert.notNull(Account, "Account must not be null");
		return this.hotelRepository.findByAccount(Account, pageable);
	}*/
}
