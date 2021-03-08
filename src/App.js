import {Box, Link, Text} from '@chakra-ui/react'

function App() {
  return (
    <div>
      <WelcomeMessage/>
    </div>
  );
}

const WelcomeMessage = () => {
  return <Box bg="#f9f9f9" w="100%" h="100vh" pb="240px" display="flex" alignItems="center" justifyContent="center">
    <Box p="16px" rounded="4px"bg="white" boxShadow="md">
      <Box fontSize="32px">Snyder Consulting, LLC</Box>
      <Box fontSize="20px" mt="8px">
        This website is under construction, check back soon.
      </Box>
      <Box mt="24px">
        <Text fontSize="18px" fontWeight="bold">
          Contact
        </Text>
        <Text>
          {"Email: "}
          <Link href="mailto:andrew.snyder@snyderconsulting.tech" isExternal>
                      andrew.snyder@snyderconsulting.tech
          </Link>
        </Text>
        <Text>
          Phone: 701.770.9530
        </Text>
        <Text>
          {"LinkedIn: "}
          <Link href="https://www.linkedin.com/in/andrew-snyder-88814a127/" isExternal>
            https://www.linkedin.com/in/andrew-snyder-88814a127/
        </Link> 
        </Text>
      </Box>
    </Box>
  </Box>
}

export default App;
